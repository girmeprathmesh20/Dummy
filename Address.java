public class Address
  {
    private String countryName;
	private String stateName;
	private String cityName;
	private int pincode;
	private String landmark;
   
    public  Address(String countryName,String stateName,String cityName,int pincode,String landmark)
   {
      this.countryName = countryName;
	  this.stateName = stateName;
	  this.cityName = cityName;
	  this.pincode = pincode;
	  this.landmark = landmark;
   }
  
   public String getCountryName()
   {
     return countryName;
   }
   public void setCountryName()
   {
       this.countryName = countryName;
   }
   public String getStateName()
   {
     return stateName;
   }
   public void setStateName()
   {
     this.stateName = stateName;
   }
    public String getCityName()
   {
     return cityName;
   }
   public void setCityName()
   {
     this.cityName = cityName;
   }
   public int getPincode()
   {
      return pincode;
   }
   public void setPincode()
   {
       this.cityName = cityName;
   }
   public String getLandmark()
   {
       return landmark;
   }
   public void setLandmark()
   {
      this.landmark = landmark;
   }
   
   @Override
   public String toString()
   {
      return  "Address [country = "+countryName+" ,stateName= "+stateName+",cityName= "+cityName+",pincode= "+pincode+",landmark="+landmark+"]"; 
   }
}