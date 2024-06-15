import java.io.*;

class Employeeinfo {
	
	public static void main(String argss[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter employee ID");
	int eid=Integer.parseInt(br.readLine());
	System.out.println("enter employee Name");
	String eida=br.readLine();
	System.out.println("enter employee Department");
	String eidaa=br.readLine();
	System.out.println("enter employee Gender");
	char eidc=(char)br.read();
	br.skip(2);
	System.out.println("enter employee Martial Status");
	String eidab=br.readLine();
	System.out.println("enter employee Salary");
	Float eidd=Float.parseFloat(br.readLine());
	System.out.println("enter employee Phone Number");
	long eidac=Long.parseLong(br.readLine());
	System.out.println("enter employee Email");
	String eidad=br.readLine();
	System.out.println("Employee ID= "+eid);
	System.out.println("Employee Name= "+eida);
	System.out.println("Employee Department= "+eidaa);
	System.out.println("Employee Gender= "+eidc);
	System.out.println("Employee Martial Status= "+eidab);
	System.out.println("Employee Salary= "+eidd);
	System.out.println("Employee Phone Number= "+eidac);
	System.out.println("Employee Email= "+eidad);
	
	}
	}