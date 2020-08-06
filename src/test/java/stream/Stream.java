package stream;

public class Stream {

    public static void main(String[] args) {
        /*Calendar calendar = Calendar.getInstance();
        long time = calendar.getTime().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(time));
        System.out.println(simpleDateFormat.format(time/(300*1000)*(300*1000)));*/

       /* List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);*/

        /*Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);*/

		/*List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// 获取对应的平方数
		numbers.stream().map( i -> i*i).distinct().forEach(System.out::println);*/

		/*List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		// 获取空字符串的数量
		long count =strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);*/

		/*Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);*/

		/*Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);*/

		/*List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		// 获取空字符串的数量
		long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(count);*/

        /*List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);*/

        /*List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());*/
    }
}
