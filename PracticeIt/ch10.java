package PracticeIt;
import java.util.ArrayList;

public class ch10 {
    
public static void main(final String[] args) {
    
}
// 10.4
public void doubleList(final ArrayList<String> list) {
  final int size = list.size();
  for(int i = 0; i < size; i++){
      final String word = list.get(2*i);
      list.add(2*i + 1, word);
  }
}
// 10.7
public void removeDuplicates(final ArrayList<String> list) {
  for(int i = 0; i < list.size() -1; i++){
    if(list.get(i).equals(list.get(1+i))){
      list.remove(i+1);
      i--;
    }
  }
}
// 10.12
public void markLength4(final ArrayList<String> list) {
  for(int i = 0; i < list.size(); i++){
    if(list.get(i).length() == 4){
      list.add(i, "****");
      i++;
    }
  }
}

// 10.18
public void interLeave(final ArrayList<Integer>a1, final ArrayList<Integer>a2) {
  int totalLength = Math.min(a1.size(), a2.size());
  int i;
  for(i = 0; i < totalLength; i++){
    final int fill = a2.get(i);
    a1.add(2*i+1, fill);
  }
  if(i < a2.size()){
    for(int j=i; j<a2.size(); j++){
      a1.add(a2.get(j));
    }
  }
}

// 10.19
public static void mirror(ArrayList<String> list) {
  for(int i = list.size()-1; i >= 0 ; i--){
    list.add(list.get(i));
  }
}
}