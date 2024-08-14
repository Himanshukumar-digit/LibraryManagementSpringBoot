package com.digit.LMSApp.LmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.LMSApp.Entity.Book;
import com.digit.LMSApp.Entity.PurchaseBook;
import com.digit.LMSApp.LmsService.PurchaseService;
import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Payload.PurchaseDto;
import com.digit.LMSApp.Repository.BookRepository;
import com.digit.LMSApp.Repository.PurchaseRepository;
@Service
public class PurchaseImpl implements PurchaseService{
	@Autowired
	PurchaseRepository prepo;
	@Autowired
	BookRepository brepo;

	@Override
	public PurchaseDto purchasebook(int bid) {
		// TODO Auto-generated method stub
		Book b = brepo.findById(bid).get();
		PurchaseBook p=new PurchaseBook();
		p.setAuthor(b.getAuthor());
		p.setBid(b.getBid());
		p.setBname(b.getBname());
		p.setCost(b.getCost());
		PurchaseBook pb=prepo.save(p);
		PurchaseDto presp = new PurchaseDto();
		presp.setPid(p.getPid());
		presp.setBid(p.getBid());
		presp.setBname(p.getBname());
		presp.setAuthor(p.getAuthor());
		presp.setCost(p.getCost());
		return presp;
		
	}

	@Override
	public PurchaseDto purchasebooks(int pid) {
		// TODO Auto-generated method stub
		PurchaseBook p=prepo.findById(pid).get();
		PurchaseDto presp = new PurchaseDto();
		presp.setPid(p.getPid());
		presp.setBid(p.getBid());
		presp.setBname(p.getBname());
		presp.setAuthor(p.getAuthor());
		presp.setCost(p.getCost());
		return presp;
		
		
	}

	@Override
	public String deletepurchasedBook(int pid) {
		// TODO Auto-generated method stub
		prepo.deleteById(pid);

		return "Deleted Successfully";
	}

	@Override
	public List<PurchaseDto> getAllPurchase() {
		// TODO Auto-generated method stub
		
		List<PurchaseBook> pb=prepo.findAll();
		List<PurchaseDto> pd=new ArrayList<PurchaseDto>();
		for(PurchaseBook book:pb) {
			PurchaseDto pdto=new PurchaseDto();
			pdto.setPid(book.getPid());
			pdto.setBid(book.getBid());
			pdto.setBname(book.getBname());
			pdto.setAuthor(book.getAuthor());
			pdto.setCost(book.getCost());
			pd.add(pdto);
		}
		return pd;
	}

	@Override
	public PurchaseDto updatePurchase(int pid, PurchaseDto pdto) {
		// TODO Auto-generated method stub
		PurchaseBook p=prepo.findById(pid).get();
		PurchaseDto presp = new PurchaseDto();
		presp.setPid(p.getPid());
		presp.setBid(p.getBid());
		presp.setBname(p.getBname());
		presp.setAuthor(p.getAuthor());
		presp.setCost(p.getCost());
		prepo.save(p);
		
		return presp;
	}
	
	
	

}
