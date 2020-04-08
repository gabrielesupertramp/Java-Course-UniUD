public class Ternario{
  public static int btrVal(String num){
    int n = num.length();
    int v = 0;
    
    for (int i=0; i<n; i=i+1){
      v = (3 * v) + btdVal(num.charAt(i));
    }
    return v;
  }
  
  public static int btdVal(char btd){
    if (btd == '-'){
      return -1;
    } else if (btd == '.'){
      return 0;
    } else {
      return 1;
    }
  }
}