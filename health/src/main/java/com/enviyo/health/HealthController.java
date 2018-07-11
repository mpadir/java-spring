package com.enviyo.health;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.management.relation.RelationNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enviyo.health.dao.DrugRepository;
import com.enviyo.health.model.Drug;

@CrossOrigin
@RestController
public class HealthController {
	
	private static final String id = null;
	@Autowired
	DrugRepository drugRepository;
	
	@GetMapping("/health")
	public List<Drug> get() {
	   /* Optional<Drug> drug = drugRepository.findById(new BigDecimal("2"));
	    if(drug.isPresent())
	    {
	    	return drug.get();
	    }else
	    {
	    	return null;
	    }*/
		List<Drug> drug = (List<Drug>) drugRepository.findAll();

		return drug;
		
	}
	@PostMapping("/healthP")
	public ResponseEntity<Drug> update(@RequestBody Drug drug){
		Drug newDrug = new Drug();
		if (drug != null ) {

			newDrug =	drugRepository.save(drug);
		}
			
		return new ResponseEntity<Drug>(newDrug,HttpStatus.OK);
	}
	
	@DeleteMapping("/healthD{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
	Optional<Drug> drug = drugRepository.findById(2);
				drugRepository.deleteById(2);

				return ResponseEntity.ok().build();		
	
			
	}

}





