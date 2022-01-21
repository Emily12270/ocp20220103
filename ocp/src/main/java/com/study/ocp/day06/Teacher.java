package com.study.ocp.day06;

public class Teacher extends Person {
		private Integer salary;
		
		public Teacher() {}
		
		public Teacher(String name, Integer age, Integer salary) {
			super.setAge(age);
			super.setName(name);
			this.salary = salary;
		}
		public Integer getSalary() {
			return salary;
		}
		public void setSalary(Integer salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Teacher [salary=" + salary + ", toString()=" + super.toString() + "]";
		}
		
	

}
