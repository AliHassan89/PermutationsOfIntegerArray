package test.java;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import main.java.Permutation;
import org.junit.Test;

public class PermutationTest {
  private static final Permutation permutation = new Permutation();

  @Test
  public void shouldCheckForEmptyInputArray(){
    //given
    int[] arr = {};

    //when
    List<List<Integer>> result = permutation.permute(arr);

    //then
    assertThat(result.size(), equalTo(0));
  }

  @Test
  public void shouldCheckForAllPermutations(){
    //given
    int[] arr = {1,2,3};
    List<List<Integer>> expectedResult = new ArrayList<>();
    List<Integer> l1 = new ArrayList<>();
    l1.add(1);
    l1.add(2);
    l1.add(3);
    List<Integer> l2 = new ArrayList<>();
    l2.add(1);
    l2.add(3);
    l2.add(2);
    List<Integer> l3 = new ArrayList<>();
    l3.add(2);
    l3.add(1);
    l3.add(3);
    List<Integer> l4 = new ArrayList<>();
    l4.add(2);
    l4.add(3);
    l4.add(1);
    List<Integer> l5 = new ArrayList<>();
    l5.add(3);
    l5.add(2);
    l5.add(1);
    List<Integer> l6 = new ArrayList<>();
    l6.add(3);
    l6.add(1);
    l6.add(2);
    expectedResult.add(l1);
    expectedResult.add(l2);
    expectedResult.add(l3);
    expectedResult.add(l4);
    expectedResult.add(l5);
    expectedResult.add(l6);

    //when
    List<List<Integer>> result = permutation.permute(arr);

    //then
    assertThat(result.size(), equalTo(6));
    assertThat(result.get(0), equalTo(l1));
    assertThat(result.get(1), equalTo(l2));
    assertThat(result.get(2), equalTo(l3));
    assertThat(result.get(3), equalTo(l4));
    assertThat(result.get(4), equalTo(l5));
    assertThat(result.get(5), equalTo(l6));
  }
}
