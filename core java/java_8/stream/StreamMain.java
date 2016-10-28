package conn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		

		List<Fruit> fruits=TestData.getAllFruits();
		
		
		//low calorie fruit
		List<Fruit> lowCalorieFruit = fruits.stream()
				.filter(Fruit ->
		Fruit.getCalories() < 100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList());
		
		System.out.println("low calorie friut::"+lowCalorieFruit);
		
		
		//colorwise list fruit
		
		Map<String,List<Fruit>> colorwiseFruit= fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getColor, Collectors.toList()));
		System.out.println("\ncolour wise friut::"+colorwiseFruit);
		
		
		//red colour fruit
		List<Fruit> redcolourFruit = fruits.stream()
				.filter(Fruit ->
				Fruit.getColor().equals("Red")).sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
		System.out.println("\nRed color fruit");
		TestData.printFruits(redcolourFruit);
		
	
		
		
		List<News> newsList=TestData.getAllNews();
		
		//newsiD with maximum comments
		
		Map<Integer, Long> newsId = newsList.stream()
				.collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));
		
		
		System.out.println("\n News ID with max comments");
		System.out.println(newsId);
		
		
		//budget count
		long cnt=newsList.stream()
				.filter(News->News.getComment().contains("budget")).count();
		System.out.println("\n Word Budget Count:"+cnt);
		
		
		//commentby user wise number of comments
		Map<String, Long> commentbyusercount = newsList.stream()
				.collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		System.out.println("\nCommentby user wise number of comments:"+commentbyusercount);
		
		
	//	List<Trader > traders=TestData.getAllTransactions();
		
		
		
		List<Transaction> transactions=TestData.getAllTransactions();
		
		//transaction in year 2011
		List<Transaction> transact2011 = transactions.stream()
				.filter(Transaction ->
				Transaction.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		System.out.println("\nTransaction in year 2011");
		TestData.printTransactions(transact2011);
		
		
		//unique cities
		List<Transaction> cities=transactions.stream().distinct().collect(Collectors.toList());
		System.out.println(cities);
	}
}
