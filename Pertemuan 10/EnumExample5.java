//fazil basri

class EnumExample5{
 enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
SATURDAY}
 public static void main(String args[]){
    Day day=Day.MONDAY;
    switch(day){
  case SUNDAY: System.out.println("sunday");
    break;
  case MONDAY: System.out.println("monday");
    break;
  default: 
    System.out.println("other day");
    }
 }
} 
    
/**
	Output:
	monday

  switch case dapat diterpakan dalam enum , dimana pda code ini parameter dalam
  switch berupa MONDAY , ouput adalah monday sesuai dengan code.
*/    