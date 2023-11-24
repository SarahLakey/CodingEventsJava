package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//this is an interface NOT class
//naming convention: first part is the name of the class we want to store
//         second part is "Repository"
//         sometimes you'll see "DAO" instead of repository for "Data Access Object"

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
