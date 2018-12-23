public class Friend 
{
  private String name;
  private String phone;
  private String birthday;

  public Friend(String name, String phone) {

    this.name = name;
    this.phone = phone;
  }
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return String return the birthday
     */
    public String getBirthday() {
        return birthday;
    }
    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
      if (checkValidDate(birthday) == true) {
        this.birthday = birthday;        
      }
  
  }

  // Birthday validation check
  public boolean checkValidDate(String date) {
  
    if (date.length() != 10) {
      System.out.println("����� ����������");
      return false;
    } else if (Integer.parseInt(date.substring(0,2)) <=1 || Integer.parseInt(date.substring(0,2)) > 31) {
      System.out.println("����� �����");
      return false;
    } else if (Integer.parseInt(date.substring(3,5)) <=1 || Integer.parseInt(date.substring(3,5)) > 12 ) {
      System.out.println("����� ����");
      return false;
    } else {
      return true;
    }
    
  }

  //��������� �������������� ��� ���� ��������
  public String getMonthBirthday(){
    return birthday.substring(3, 5);    
  }

  //��������� �������������� ��� ����� ��������
  public String getDayBirthday(){
    return birthday.substring(0, 2);    
  }

  //�������� ��������� ����� <�����>, <��������>, <���������� ��������>
  public void printFriend() {
    System.out.println( name + ", " + phone + ",  " + birthday );
}
  //�������� ��������� ����� <�����>, <�����> / <�����>
  public void printAFriendBirthday() {
    System.out.println( name + ", " + getDayBirthday() + "/" + getMonthBirthday() );
}

}