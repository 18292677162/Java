package Test;

//Create a "driver" class
public class Driver {
	//ÊôÐÔ
    private String name;      //name
	private String sex;       //sex
	private int driving_age;  //driving_age
	private int age;          //age
	private String car_model; //car_model
	private int id;           //id

	//method
	public void Turnleft() {
		System.out.println(name + "turn left");
	}	
	public void TurnRight() {
		System.out.println(name + "turn right");
	}
	public void TurnBack() {
		System.out.println(name + "astern");
	}
	
	//A constructor
	public Driver(String name, String sex, int driving_age, int age, String car_model, int id){
		this.setName(name);
		this.setSex(sex);
		this.setDriving_age(driving_age);
		this.setAge(age);
		this.setCar_model(car_model);
		this.setId(id);
	}
	
	//name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//sex
	public void setSex(String sex) {
		if((sex=="male")||(sex=="female"))
		{
			this.sex = sex;
		}
		else
		{
			this.sex="Î´Öª";
		}
	}
	public String getSex() {
		return sex;
	}
	
	//driving_age
	public void setDriving_age(int driving_age) {
		this.driving_age = driving_age;
	}
	public int getDriving_age() {
		return driving_age;
	}
	
	//age
	public void setAge(int age) {
		this.age = age;
	}
	public int getaAge() {
		return age;
	}
	
	//car_model
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public String getCar_model() {
		return car_model;
	}
	
	//id
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}