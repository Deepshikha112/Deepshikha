package com.springdemo.repository;

import com.springdemo.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Integer>
{
    ////Q4- For class Person find person declare methods in repository to find person by firstname,lastname and id.
   List<Person> findByFirstName(String firstname);
    List<Person> findByLastName(String lastname);
    Person findById(Integer id);

    //Q5- Use @Query to fetch firstname of the Person whose age is 25.
    @Query("SELECT firstName from Person where age=:age")
    String findByAge(@Param("age") Integer age);

    // Q6-Use @Query to fetch firstname and lastname of the Person whose age is 25.
    @Query("SELECT firstName,lastName from Person where age=:age")
    List<Object[]> findFirstNameAndLastNameByAge(@Param("age") Integer age);

    //    //Q7- Get complete information of the Employee whose age is 25 using @Query.
    @Query("select p from Person p where age = :age")
    List<Person> findPersonByAge(@Param("age") Integer age);


    //Q8- Count Person where name is "Peter" using @Query.
    @Query("select count(*) from Person where firstName = :firstName")
    Integer countByFirstName(@Param("firstName") String firstName);

    //Q9
     Integer countById(Integer id);
        List<Person> findDistinctByFirstName(String firstName);
     List<Person> findByFirstNameOrLastName(String firstName, String lastName);

    //Q9- Implement following methods for Person repository: and
    List<Person> findByFirstNameAndLastName(String firstName, String lastName);

    //Q9- Implement following methods for Person repository: between
    List<Person> findByAgeBetween(int min, int max);

    //Q9- Implement following methods for Person repository: less than
    List<Person> findByAgeLessThan(int max);

    //Q9- Implement following methods for Person repository: greater than
    List<Person> findByAgeGreaterThan(int min);

    //Q9- Implement following methods for Person repository: like
    List<Person> findByFirstNameLike(String firstName);

    //Q9- Implement following methods for Person repository: not
    List<Person> findByFirstNameNot(String firstName);

    //Q9- Implement following methods for Person repository: in
    List<Person> findByAgeIn(List<Integer> ageList);

    //Q9- Implement following methods for Person repository: ignore case
    List<Person> findByFirstNameIgnoreCase(String firstName);

    //Q10- Get the persons greater than age 25 and sort them in descending order according to id by method query.
    List<Person> findByAgeGreaterThanOrderByIdDesc(int age);

    //Q11- Do  the question above using the Sort class.
    List<Person> findByAgeGreaterThan(int age, Sort sort);

    //Q12- Apply Pagination on Person entities.
    Page<Person> findAll(Pageable pageable);
}


