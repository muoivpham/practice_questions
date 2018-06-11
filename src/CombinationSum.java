import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		getResult(result, new ArrayList<Integer>(), candidates, target, 0);
		return result;
	}

	private void getResult(List<List<Integer>> result, ArrayList<Integer> arrayList, int[] candidates, int target,
			int start) {
		// TODO Auto-generated method stub
		if (target > 0) {
			for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
				arrayList.add(candidates[i]);
				getResult(result, arrayList, candidates, target - candidates[i], i);
				arrayList.remove(arrayList.size() - 1);
			}
		} else if (target == 0) {
			result.add(new ArrayList<Integer>(arrayList));
		}

	}

}
