package com.cts.offermicroservice.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;
import com.cts.offermicroservice.model.Offer;
import com.cts.offermicroservice.model.OfferCategory;

@Service
public interface OfferService {
	public Offer addOffer(String token, Offer offer);
	public Offer engageOffer(String token, int offerId, int empId);
	public Offer editOffer(String token, Offer offerNew, int OfferId);
	public Offer viewOffer(String token, int offerid);
	public List<Offer> getOfferByPostedDate(String token, String date) throws ParseException;
	public List<Offer> getOfferByCategory(String token, int catid);
	public List<Offer> getOfferByTopLikes(String token);
	public List<Offer> getOfferByEmpId(String token, int empid);
	public Offer updateLikes(String token, int offerid, int empid);
	public List<Offer> viewAllOffers(String token);
	public OfferCategory getCategory(String token, int catid);

}
