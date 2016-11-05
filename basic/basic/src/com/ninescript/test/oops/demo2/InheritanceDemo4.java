package com.ninescript.test.oops.demo2;


/**
 * @author Piyush
 */
	class Author {
		
		String authorName;
		int age;
		String place;

		Author(String name, int age, String place) {
			
			this.authorName = name;
			this.age = age;
			this.place = place;
		}

		public String getAuthorName() {
			
			return authorName;
		}

		public int getAge() {
			
			return age;
		}

		public String getPlace() {
			
			return place;
		}
	}

	class Book {
		
		String name;
		int price;

		
		Author auth;

		Book(String n, int p, Author at) {
			
			this.name = n;
			this.price = p;
			this.auth = at;
		}

		public void showDetail() {
			
			System.out.println("Book is " + name);
			System.out.println("price " + price);
			System.out.println("Author is  " + auth.getAuthorName());
		}
	}

	class InheritanceDemo4 {
		
		public static void main(String args[]) {
			
			Author ath = new Author("Piyush", 22, "India");
			Book b = new Book("Java", 550, ath);
			b.showDetail();
		}
	}

	

	



