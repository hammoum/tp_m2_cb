package org.paumard.controler;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.paumard.ejb.MarinEJB;
import org.paumard.model.Marin;

@SuppressWarnings("serial")
@Named("marinControler")
@SessionScoped
public class MarinControler implements Serializable {
	
	@Inject
	private transient MarinEJB marinEJB ;
	
	private Marin marin = new Marin() ;

	public void create() {
		Long id = marinEJB.createMarin(marin) ;
		System.out.println("Marin persisté : " + id) ;
	}
	
	@SuppressWarnings("unchecked")
	public void delete() {
		
		marins= marinEJB.deleteMarin(marin);
		System.out.println("Marin persisté : " + marin.getNom()) ;
		
	}
	@SuppressWarnings("unchecked")
        public void deletePrenom() {
		
		marins= marinEJB.deleteMarinByPrenom(marin);
		System.out.println("Marin persisté : " + marin.getPrenom()) ;
		
	}
	public Marin getMarin() {
		return marin;
	}

	public void setMarin(Marin marin) {
		this.marin = marin;
	}
}
