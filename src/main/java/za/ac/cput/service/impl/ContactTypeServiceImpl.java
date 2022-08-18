/* ContactTypeServiceImpl.java
 Author: Chad Siegelaar (218340982)
 Date: 11 August 2022
*/

package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.ContactType;
import za.ac.cput.repository.ContactTypeRepository;
import za.ac.cput.service.ContactTypeService;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ContactTypeServiceImpl implements ContactTypeService {
    private ContactTypeRepository repository;

    @Autowired
    ContactTypeServiceImpl(ContactTypeRepository repository) {
        this.repository = repository;}

    @Override
    public ContactType save(ContactType contactType) {
        return this.repository.save(contactType);}

    @Override
    public Optional<ContactType> read(String id) {
        return Optional.ofNullable(this.repository.findById(id).orElse(null));}

    @Override
    public boolean delete(ContactType contactType){
        this.repository.delete(contactType);
        return false;
    }

    @Override
    public Set<ContactType> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}