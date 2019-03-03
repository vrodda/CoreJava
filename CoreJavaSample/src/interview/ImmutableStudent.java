package interview;
public final class ImmutableStudent 
{ 
    final String name; 
    final int regNo; 
    final Age age;  
    
    
 
    public ImmutableStudent(String name, int regNo, Age age) {
		super();
		this.name = name;
		this.regNo = regNo;
	//So we modify the constructor in order to clone the passed argument of Age and use a clone instance of it.
		Age newAgeDeepCopy = new Age();
		newAgeDeepCopy.setDay(age.getDay());
		newAgeDeepCopy.setMonth(age.getMonth());
		newAgeDeepCopy.setYear(age.getYear());
		
		this.age = newAgeDeepCopy;
	}
    
    
    
    
	public Age getAge() {
		return age;
	}


	public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 
} 