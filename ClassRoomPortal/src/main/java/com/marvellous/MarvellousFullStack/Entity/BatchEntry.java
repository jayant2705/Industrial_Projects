package com.marvellous.MarvellousFullStack.Entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BatchDetails")
@Getter
@Setter
public class BatchEntry
{
    private ObjectId id;
    private String Name;
    private  int fess;

    public Object getName()
    {
        return Name;
    }
    public Object setName(Object name)
    {
        return Name;
    }

    public Object setFees(Object fees)
    {
        return fess;
    }

    public Object getFees()
    {
        return fess;
    }
}
