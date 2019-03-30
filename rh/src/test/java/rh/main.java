package rh;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.erpproject.entities.Address;
import com.erpproject.entities.City;
import com.erpproject.entities.Contact;
import com.erpproject.entities.Country;
import com.erpproject.entities.District;
import com.erpproject.entities.Employee;
import com.erpproject.entities.Person;
import com.erpproject.entities.State;

public class main {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Employee employee1 = new Employee(1, (Date)formatter.parse("28/03/2019 10:00"),"@System", null, null,"2018120001", 
								 new Person(1, (Date)formatter.parse("28/03/2019 10:00"),"@System", null, null, 1, "Ronaldo Torre", 
										    null, 2, (Date)formatter2.parse("18/05/1984"), "Itápolis-SP", "31449762883", "436895365", null, 
										    2, null, "Isabel Cássia", "Guido Torre"), 
								 new BigDecimal("8000"));
			
			
			employee1.getPerson().Contacts.add(new Contact(1,employee1.getAddDate(),employee1.getAddUser(), null, null, employee1.getPerson().getId(), 1, "(16)99436-3636"));
			
			employee1.getPerson().Addresses.add(new Address(1, employee1.getAddDate(),employee1.getAddUser(), null, null, 1, 1, "05144000", "Rua Eugênio Lorenzetti", "130", "Torre2 Apto.113", 
												new District(1, employee1.getAddDate(),employee1.getAddUser(), null, null, "Jardim Íris", "3550308"), 
												new City(0, employee1.getAddDate(),employee1.getAddUser(), null, null, "São Paulo", "3550308", 
														new State(0, employee1.getAddDate(),employee1.getAddUser(), null, null, "São Paulo", "SP",
																new Country(1, employee1.getAddDate(),employee1.getAddUser(), null, null, "Brasil", "República Federativa do Brasil", "BRL", "Real", "R$")))));
			
			System.out.println("RE: " + employee1.Register);
			System.out.println("Nome: " + employee1.getPerson().getName());
			System.out.println("Dt Nasc.: " + formatter2.format(employee1.getPerson().getBirthDate()));
			System.out.println("Telefone: " + employee1.getPerson().Contacts.get(0));
			System.out.println("Endereço: " + employee1.getPerson().Addresses.get(0).toString());
				
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
	}

}