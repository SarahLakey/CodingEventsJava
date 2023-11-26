package org.launchcode.codingevents.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Objects;

//dry code by creating inheritance - will bet taking out ID from Event and EventCategory class
// in those other classes you have to add "extends AbstractEntity" so it can still access ID
//want this to be an abstract class -- the purpose is for it to collect shared data to share with other classes
//add persistent data with @MappedSuperClass
//         --indicates fields in this class should be pushed down into the tables for the objects that extend it

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity entity = (AbstractEntity) o;
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
