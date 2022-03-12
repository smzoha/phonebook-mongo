package com.zedapps.phonebook.service;

import com.zedapps.phonebook.entity.Contact;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Shamah M Zoha
 * @since 10-Mar-22
 */
@Service
public class ContactService {

    @Autowired
    private MongoTemplate template;

    public List<Contact> getAllContacts() {
        return template.findAll(Contact.class);
    }

    public List<Contact> getAllContactsForUser(String enteredById) {
        return template.find(new Query(Criteria.where("enteredBy.$id").is(new ObjectId(enteredById))), Contact.class);
    }

    public Contact getContactById(String id) {
        return template.findById(id, Contact.class);
    }

    public Contact save(Contact contact) {
        return template.save(contact);
    }

    public boolean delete(Contact contact) {
        return template.remove(contact).getDeletedCount() > 0;
    }
}
