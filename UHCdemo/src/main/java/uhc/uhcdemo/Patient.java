package uhc.uhcdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Patient implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("patient id")
   private java.lang.String id;
   @org.kie.api.definition.type.Label("name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("Phone")
   private java.lang.String phone;
   @org.kie.api.definition.type.Label("Gender")
   private java.lang.String gender;
   @org.kie.api.definition.type.Label("birth date")
   private java.util.Date birthdate;
   @org.kie.api.definition.type.Label("Appointment Date")
   private java.util.Date apptdate;
   @org.kie.api.definition.type.Label("providername")
   private java.lang.String providername;
   @org.kie.api.definition.type.Label("risk")
   private java.lang.String risk;
   @org.kie.api.definition.type.Label("category")
   private java.lang.String category;

   @org.kie.api.definition.type.Label("appointment dept")
   private java.lang.String dept;

   @org.kie.api.definition.type.Label("Appointment Reason")
   private java.lang.String apptreason;

   @org.kie.api.definition.type.Label("Visit Type")
   private java.lang.String visittype;

   @org.kie.api.definition.type.Label("Is Scheduled")
   private boolean isscheduled;

   @org.kie.api.definition.type.Label("Appointment Type")
   private java.lang.String appttype;

   @org.kie.api.definition.type.Label("Special Case")
   private boolean specialcase;

   @org.kie.api.definition.type.Label(value = "Appt Special Case")
   private java.lang.Boolean apptspecialcase;

   public Patient()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getPhone()
   {
      return this.phone;
   }

   public void setPhone(java.lang.String phone)
   {
      this.phone = phone;
   }

   public java.lang.String getGender()
   {
      return this.gender;
   }

   public void setGender(java.lang.String gender)
   {
      this.gender = gender;
   }

   public java.util.Date getBirthdate()
   {
      return this.birthdate;
   }

   public void setBirthdate(java.util.Date birthdate)
   {
      this.birthdate = birthdate;
   }

   public java.util.Date getApptdate()
   {
      return this.apptdate;
   }

   public void setApptdate(java.util.Date apptdate)
   {
      this.apptdate = apptdate;
   }

   public java.lang.String getProvidername()
   {
      return this.providername;
   }

   public void setProvidername(java.lang.String providername)
   {
      this.providername = providername;
   }

   public java.lang.String getRisk()
   {
      return this.risk;
   }

   public void setRisk(java.lang.String risk)
   {
      this.risk = risk;
   }

   public java.lang.String getCategory()
   {
      return this.category;
   }

   public void setCategory(java.lang.String category)
   {
      this.category = category;
   }

   public java.lang.String getDept()
   {
      return this.dept;
   }

   public void setDept(java.lang.String dept)
   {
      this.dept = dept;
   }

   public java.lang.String getApptreason()
   {
      return this.apptreason;
   }

   public void setApptreason(java.lang.String apptreason)
   {
      this.apptreason = apptreason;
   }

   public java.lang.String getVisittype()
   {
      return this.visittype;
   }

   public void setVisittype(java.lang.String visittype)
   {
      this.visittype = visittype;
   }

   public boolean getIsscheduled()
   {
      return this.isscheduled;
   }

   public void setIsscheduled(boolean isscheduled)
   {
      this.isscheduled = isscheduled;
   }

   public java.lang.String getAppttype()
   {
      return this.appttype;
   }

   public void setAppttype(java.lang.String appttype)
   {
      this.appttype = appttype;
   }

   public java.lang.Boolean getSpecialcase()
   {
      return this.specialcase;
   }

   public void setSpecialcase(java.lang.Boolean specialcase)
   {
      this.specialcase = specialcase;
   }

   public java.lang.Boolean getApptspecialcase()
   {
      return this.apptspecialcase;
   }

   public void setApptspecialcase(java.lang.Boolean apptspecialcase)
   {
      this.apptspecialcase = apptspecialcase;
   }
   
   public String toString(){
       System.out.println("gender"+gender+"risk"+risk+"category"+category+"type"+appttype+"department"+dept+"reason"+apptreason+
       "visittype"+visittype);
       return "gender"+gender+"risk"+risk+"category"+category+"type"+appttype+"department"+dept+"reason"+apptreason+
       "visittype"+visittype+"apptSpecialCase"+apptspecialcase;
   }

   public Patient(java.lang.String id, java.lang.String name,
         java.lang.String phone, java.lang.String gender,
         java.util.Date birthdate, java.util.Date apptdate,
         java.lang.String providername, java.lang.String risk,
         java.lang.String category, java.lang.String dept,
         java.lang.String apptreason, java.lang.String visittype,
         boolean isscheduled, java.lang.String appttype, boolean specialcase,
         java.lang.Boolean apptspecialcase)
   {
      this.id = id;
      this.name = name;
      this.phone = phone;
      this.gender = gender;
      this.birthdate = birthdate;
      this.apptdate = apptdate;
      this.providername = providername;
      this.risk = risk;
      this.category = category;
      this.dept = dept;
      this.apptreason = apptreason;
      this.visittype = visittype;
      this.isscheduled = isscheduled;
      this.appttype = appttype;
      this.specialcase = specialcase;
      this.apptspecialcase = apptspecialcase;
   }

}