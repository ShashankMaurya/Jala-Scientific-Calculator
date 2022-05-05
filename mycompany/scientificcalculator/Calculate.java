package com.mycompany.scientificcalculator;

public class Calculate implements iCalc {

    double dnum, res;
    char op;
    int fnum, snum;
    boolean iflag, dflag, f;

    Calculate()
    {
        dnum=0.0;
        fnum=0;
        snum=0;
        res=0.0;
    }

    Calculate(double dblNum, char cOperator)
    {
        dnum=dblNum;
        op=cOperator;
        f=false;
        dflag=true;
    }

    Calculate(int iFirstNum, char cOperator, int iSecondNum)
    {
        fnum=iFirstNum;
        op=cOperator;
        snum=iSecondNum;
        f=true;
        iflag=true;
    }


    @Override
    public void doCalculation() {

        if(f) {
            switch (op) {
                case '+' -> res = fnum + snum;

                case '-' -> res = fnum - snum;

                case '*' -> res = fnum * snum;

                case '/' -> res = fnum / snum;

                default -> {
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
            }
        }
        else
        {
            f=false;
            switch(op)
            {
                case 'A' -> res = Math.sin(dnum);

                case 'B' -> res = Math.cos(dnum);

                case 'C' -> res = Math.tan(dnum);

                case 'D' -> res = Math.log(dnum);

                default -> {
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
            }
        }
    }

    @Override
    public void getResult() {
        System.out.println("result of calculation: "+ res);
    }

    boolean checkSecondNum()
    {
        return op == '/' && snum == 0;
    }

    boolean checkInt()
    {
        return iflag;
    }

    boolean checkDouble()
    {
        return dflag;
    }
}

