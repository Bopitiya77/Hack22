interface Person{
    String name;
    String getName();
    void setName(String name);
}

class Constituency{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int areaInKM;
    public int getAreaInKM() {
        return areaInKM;
    }
    public void setAreaInKM(int areaInKM) {
        this.areaInKM = areaInKM;
    }
    private MP MPofConstituency;
        public MP getMPofConstituency() {
        return MPofConstituency;
    }
    public void setMPofConstituency(MP mPofConstituency) {
        MPofConstituency = mPofConstituency;
    }
}

class Car
{
    private String name;
    private String color;
    Car(String name, String color)
    {
        this.name =name;
        this.color =color;
    }
}

class Driver implements Person
{
    String name;
    Driver(String name)
    {
        this.name= name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }    
}

class CarDriver extends Driver
{
    CarDriver(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    private int yearsOfCarDrivingExperience;
    public int getYearsOfCarDrivingExperience() {
        return yearsOfCarDrivingExperience;
    }
    public void setYearsOfCarDrivingExperience(int yearsOfCarDrivingExperience) {
        this.yearsOfCarDrivingExperience = yearsOfCarDrivingExperience;
    }
    
}

class MP implements Person
{
    String name;
    int spendingLimit;
    @Override
    public String toString() {
        return "MP [name=" + name + ", spendingLimit=" + spendingLimit + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpendingLimit() {
        return spendingLimit;
    }
    public void setSpendingLimit(int spendingLimit) {
        this.spendingLimit = spendingLimit;
    }
    
}

public class IndianPolitics 
{
    
}
