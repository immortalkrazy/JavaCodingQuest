package leetCode;

public class GasDistance {
      public int canCompleteCircuit(int[] gas, int[] cost) {
            int start = 0;
            int extraGas = 0;
            int requiredGas = 0;
            for (int i = 0; i < gas.length; i++) {
                  extraGas += gas[i] - cost[i];
                  if (extraGas < 0) {
                        start = i + 1;
                        requiredGas += extraGas;
                        extraGas = 0;
                  }
            }
            if (extraGas + requiredGas >= 0)
                  return start;
            else
                  return -1;
      }
}