class Main {
  public static void main(String[] args) {
    System.out.println("Jessica König");
    zahlenfilter();
  }
   
   public static void zahlenfilter(){
   for(int i=1; i<201;i++){
     System.out.println(i);  
     if((((i-1)+i)%3==0) && (i%5==0) && (i%10==9)){
        System.out.println ( " Zahl ist durch 5 teilbar und Zahl und Vorgänger addiert ergeben Ergebnis und Ergebnis ist durch 3 teilbar und Zahl endet auf 9");
      }
      else if((((i-1)+i)%3==0) && (i%5==0)){
        System.out.println( " Zahl ist durch 5 teilbar und Zahl und Vorgänger addiert ergeben Ergebnis");
      }
      else if((((i-1)+i)%3==0) && (i%10==9)){
        System.out.println( " Zahl ist durch 5 teilbar  und Zahl endet auf 9");
      }
      else if((i%5==0) && (i%10==9)){
        System.out.println( " Zahl und Vorgänger addiert ergeben Ergebnis und Zahl endet auf 9");
      }
     else if(i%5==0){
        System.out.println ( " Zahl ist durch 5 teilbar");
      }
       else if(((i-1)+i)%3==0){
        System.out.println (" Zahl und Vorgänger addiert ergeben Ergebnis und Ergebnis ist durch 3 teilbar");
      }
      else if(i%10==9){
        System.out.println (" Zahl endet auf 9");
      }
      
   }
  }
}


 
