package CodingTest.Level2;

public class DiamonSquard {

    public DiamonSquard()
    {

    }

    public int GetNumber(int n)
    {
        int ans = 2;

        for(int i=0;i<n ;i++)
        {
            ans *= 2;
            ans--;
        }

        return (ans*ans);
    }
}
