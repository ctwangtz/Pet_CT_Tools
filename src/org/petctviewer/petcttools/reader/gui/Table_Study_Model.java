package org.petctviewer.petcttools.reader.gui;

import java.util.Date;

import javax.swing.table.DefaultTableModel;

import org.petctviewer.petcttools.reader.Series_Details;

public class Table_Study_Model extends DefaultTableModel{

	private static final long serialVersionUID = 1L;
	
	private String[] columnTitle = {"Patient Name", "Patient ID", "Date","Description", "Accession", "Study Directory", "Series Object" };
	private Class<?>[] columnClass = {String.class, String.class, Date.class, String.class, String.class, Object.class, Series_Details.class};
	
	public Table_Study_Model() {
		super(0,7);
		
	}
	
	public String getColumnName(int column){
		return columnTitle[column];
		
	}
	
	public Class<?> getColumnClass(int column){
		return columnClass[column];
		
	}
	
	public boolean isCellEditable(int row,int column){
		return false;	
	}
	
    
	

}