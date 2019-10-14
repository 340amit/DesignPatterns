// Get the unique instance of same object using clone method
// Avoids costly object creation
// Registry is created which the instance for the same object
// Eg. java.lang.Object#clone()

package designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeJavaExample {

	public static void main(String[] args) {
		String sql="Select * from table";
		List<String> paramters= new ArrayList<>();
		paramters.add("Star");
		paramters.add("Wars");
		Record record =new Record();
		
		Statement st=new Statement(sql,paramters,record);
		System.out.println(st);
		System.out.println(st.getSql());
		System.out.println(st.getParamters());
		System.out.println(st.getRecord());
		
		Statement cloneSt=st.clone(); // shallow clone
		System.out.println(cloneSt);
		System.out.println(cloneSt.getSql());
		System.out.println(cloneSt.getParamters());
		System.out.println(cloneSt.getRecord());
		

	}

}

class Statement implements Cloneable{
	private String sql;
	private List<String> paramters;
	private Record record;
	
	public Statement(String sql,List<String> parameters,Record record) {
		this.sql=sql;
		this.paramters=parameters;
		this.record=record;
	}
	
	public String getSql() {
		return sql;
	}
	public List<String> getParamters() {
		return paramters;
	}
	public Record getRecord() {
		return record;
	}
	
	public Statement clone() {
		try {
			return (Statement)super.clone();
		}catch(CloneNotSupportedException e) {
			
		}
		return null;
	}
		
}

class Record{
	
}
