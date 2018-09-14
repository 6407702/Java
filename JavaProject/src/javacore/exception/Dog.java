package javacore.exception;

public class Dog {

	String name;
	boolean isCollarPutOn;
	boolean isLeashPutOn;
	boolean isMuzzlePutOn;

	public Dog(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Dog dog = new Dog("Мухтар");
		dog.putCollar();
		dog.putMuzzle();
		try {
			dog.walk();
		} catch (DogIsNotReadyException e) {
			System.out.println(e.getMessage());
			System.out.println("Проверяем снаряжение! Ошейник надет? " + dog.isCollarPutOn + "\r\n Поводок надет? "
					+ dog.isLeashPutOn + "\r\n Намордник надет? " + dog.isMuzzlePutOn);
		}

	}

	public void putCollar() {

		System.out.println("Ошейник надет!");
		this.isCollarPutOn = true;
	}

	public void putLeash() {

		System.out.println("Поводок надет!");
		this.isLeashPutOn = true;
	}

	public void putMuzzle() {
		System.out.println("Намордник надет!");
		this.isMuzzlePutOn = true;
	}

	public void walk() throws DogIsNotReadyException {

		System.out.println("Собираемся на прогулку!");
		if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
			System.out.println("Ура, идем гулять! " + name + " очень рад!");
		} else {
			throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку!");
		}
	}

}