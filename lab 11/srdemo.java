class service_request{
	int srn;
	String complaint;
	String sr_date;
	service_request(int s,String c, String d){
		srn = s;
		complaint = c;
		sr_date = d;
	}
	void details(){
		System.out.println("Serial no : "+ srn);
		System.out.println("Complaint : "+ complaint);
		System.out.println("Date : "+ sr_date);
		System.out.println();
	}
	void months(service_request s[]){
	String m[] = {"Jan","Feb","Mar"};
	for(int i = 0;i<m.length;i++){
		System.out.println("\nMonth : " + m[i]+ "\n");
		for(int j = 0;j<s.length;j++){
			if((s[j].sr_date.substring(2,5).equals(m[i])) && (s[j].complaint.contains("road") || s[j].complaint.contains("streetlight"))){
				s[j].details();
			}
		}

	}

	}
}
class srdemo{
	public static void main(String[] args){
		service_request r[]= new service_request[5];
		r[0]= new service_request(1,"hit streetlight", "27Jan2019");
		r[1]= new service_request(2,"pothole on the road", "02Mar2020");
		r[2]= new service_request(3,"skid into streetlight", "15Feb2021");
		r[3]= new service_request(4,"tyre puncture", "05Jan2022");
		r[4]= new service_request(5,"swerved off road", "27Feb2019");
		service_request dummy = new service_request(0,"NULL","NULL");
		dummy.months(r);
	}
}