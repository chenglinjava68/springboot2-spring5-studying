package filterChain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangshukang.
 */
public class FilterChainTest {


    public static void main(String[] args) {

        MyFilter myFilter1 = new MyFilters.MyFilter1();
        MyFilter myFilter2 = new MyFilters.MyFilter2();
        MyFilter myFilter3 = new MyFilters.MyFilter3();
        List<MyFilter> filters = new ArrayList<>();
        filters.add(myFilter1);
        filters.add(myFilter2);
        filters.add(myFilter3);

        List<MyFilter> filters2 = new ArrayList<>(filters);


        FilterChain filterChain = FilterChainBuilder.buildFilterChainBuild(filters);
        filterChain.doFilter(filterChain);

        System.out.println("--------------------------------------");

        FilterChain filterChain2 = FilterChainBuilder2.buildFilterChain(filters2);
        filterChain2.doFilter(filterChain2);
    }
}
