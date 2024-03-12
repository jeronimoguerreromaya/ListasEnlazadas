package Lista;




	
	public class Persona implements Comparable<Persona>{
		private String name;
		private String id;
		
		public Persona() {}
		public Persona (String name, String id) {
			this.name= name;
			this.id = id;
		}
		@Override
	    public String toString() {
	        return "Persona{" +
	                "name='" + name + '\'' +
	                ", id='" + id + '\'' +
	                '}';
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		@Override
		public int compareTo(Persona o) {
			// TODO Auto-generated method stub
			return 0;
		}

	
}
