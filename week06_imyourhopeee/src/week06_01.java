import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class week06_01 {

	public static void main(String[] args) {
		List<String> listOfNames=Arrays.asList(new String[]
				{"Apple","Banana","Cherry"});
		List<String> sublist=listOfNames.stream()
				.map(s->s.toLowerCase())
				.collect(Collectors.toList());
		System.out.println(sublist);
	}

}