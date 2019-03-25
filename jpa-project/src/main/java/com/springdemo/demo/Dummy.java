package com.springdemo.demo;

import com.springdemo.config.PersistenceContext;
import com.springdemo.entity.Person;
import com.springdemo.repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

public class Dummy
{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(PersistenceContext.class);
        Person person=new Person();
        person.setFirstName("deepshikha");
        person.setLastName("yadav");
        person.setSalary(15000);
        person.setAge(21);
        person.setFirstName("Peter");
        person.setLastName("sins");
        person.setSalary(15000);
        person.setAge(25);
        PersonRepository personRepository=applicationContext.getBean(PersonRepository.class);
       personRepository.save(person);
        System.out.println(person);
 System.out.println("Person firstname is :"+ personRepository.findByFirstName("deepshikha"));
        System.out.println("Person lastname is :"+ personRepository.findByLastName("yadav"));
        System.out.println("Person id is :"+ personRepository.findById(1));
        System.out.println("Person age using @Query is:"+ personRepository.findByAge(21));
        for (Object[] result : personRepository.findFirstNameAndLastNameByAge(21)) {
            String firstName = (String)result[0];
            String lastName = (String)result[1];
            System.out.println("FirstName: "+firstName+", LastName: "+lastName);
        }
        System.out.println("Person all the details using @Query:"+personRepository.findPersonByAge(21));
        System.out.println("Person count with name deepshikha:"+personRepository.countByFirstName("deepshikha"));
        System.out.println("Count by id:"+personRepository.countById(1));
        System.out.println("Person with distinct name:"+personRepository.findDistinctByFirstName("deepshikha"));
        System.out.println("Find by first name or last name: "+personRepository.findByFirstNameOrLastName("Mansi","Gupta"));
        System.out.println("Find by first name and last name: "+personRepository.findByFirstNameAndLastName("Mansi","Gupta"));
        System.out.println("Find by age between: "+personRepository.findByAgeBetween(21,25));
        System.out.println("Find by age less than: "+personRepository.findByAgeLessThan(24));
        System.out.println("Find by age less than: "+personRepository.findByAgeGreaterThan(21));
        System.out.println("Find by name like: "+personRepository.findByFirstNameLike("d%"));
        System.out.println("Find by first name not in: "+personRepository.findByFirstNameNot("deepshikha"));
        List<Integer> list = new ArrayList();
        list.add(22);
        list.add(25);
        System.out.println("Find by age in: "+personRepository.findByAgeIn(list));
        System.out.println("Find by name ignore case: "+personRepository.findByFirstNameIgnoreCase("mansi"));
        System.out.println("Find by age and sort: "+personRepository.findByAgeGreaterThanOrderByIdDesc(21));
        List<Person> list1 = personRepository.findByAgeGreaterThan(22, new Sort(Sort.Direction.DESC,"id"));
        System.out.println("Find by age and sort using sort class: "+list1);
        Page<Person> personPage = personRepository.findAll(
                new PageRequest(0,3,new Sort(Sort.Direction.DESC,"id")));
        List<Person> personList = personPage.getContent();
        System.out.println("Person list via page: "+personList);

    }
}


