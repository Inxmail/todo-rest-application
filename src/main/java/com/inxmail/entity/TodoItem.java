package com.inxmail.entity;

import java.util.Date;
import java.util.Objects;


public final class TodoItem
{
	private  Long id;

	private  String description;

	private Date dueDate;


	public TodoItem()
	{
	}


	public TodoItem( Long id, String description, Date dueDate )
	{
		this.id = id;
		this.description = description;
		this.dueDate = dueDate;
	}


	public Long getId()
	{
		return id;
	}


	public void setId( Long id )
	{
		this.id = id;
	}


	public String getDescription()
	{
		return description;
	}


	public void setDescription( String description )
	{
		this.description = description;
	}


	public Date getDueDate()
	{
		return dueDate;
	}


	public void setDueDate( Date dueDate )
	{
		this.dueDate = dueDate;
	}


	@Override
	public boolean equals( Object obj )
	{
		if( obj == this )
			return true;
		if( obj == null || obj.getClass() != this.getClass() )
			return false;
		var that = (TodoItem)obj;
		return Objects.equals( this.id, that.id ) && Objects.equals( this.description, that.description ) && Objects.equals(
				this.dueDate, that.dueDate );
	}


	@Override
	public int hashCode()
	{
		return Objects.hash( id, description, dueDate );
	}


	@Override
	public String toString()
	{
		return "TodoItem[" + "id=" + id + ", " + "description=" + description + ", " + "dueDate=" + dueDate
				+ ']';
	}
}
