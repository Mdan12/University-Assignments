// For k>=0 this function returns 1+2+3+...+k.
// This is the sum of the first k integers >0.
// If k==0 then this sum is 0.
// In older versions of Dafny a function like this
// is not executable but can take part in program
// verification and the Dafny compiler "understands"
// the body of the function.
function SumInts( k: int ): int
  requires k >= 0
{
  if k == 0 then 0 else SumInts(k-1)+k
}

// Compute SumInts using a loop and prove
// that SumInts(k) == (k+1)*k/2.
method SumIntsLoop( k: int ) returns( s: int )
  requires k >= 0
  ensures s == (k+1)*k/2
  ensures s == SumInts(k)
{
  // Finish programming the body and do not
  // use recursion
  var i := ???;
  s := ???;
  while ???
    invariant 0 <= i <= k
    decreases k-i
    invariant ???
    invariant ???
  {
    ???
  }
}

// Compute SumInts using recursion and prove
// that SumInts(k) == (k+1)*k/2.
method SumIntsRecursive( k: int ) returns( s: int )
  requires k >= 0
  ensures s == (k+1)*k/2
  ensures s == SumInts(k)
{
  // Finish programming the body and use recursion
  // and no loop.
  // Only call SumIntsRecursion.
  
  ???
}

// Compute SumInts using tail recursion and prove
// that SumInts(k) == (k+1)*k.
method SumIntsTailRecursive( i: int, r: int, k: int ) returns( s: int )
  requires 0 <= i <= k
  decreases k-i
  requires r == (i+1)*i/2
  requires r == SumInts(i)
  ensures s == (k+1)*k/2
  ensures s == SumInts(k)
{
  // Finish programming the body and use tail recursion
  // and no loop.
  // Only call SumIntsTailRecursion.

  ???
}

method Main()
{
  var s1 := SumIntsLoop(5);
  var s2 := SumIntsRecursive(5);
  var s3 := SumIntsTailRecursive(0,0,5);
  var s4 := SumIntsTailRecursive(4,10,5);
  print s1;
  print s2;
  print s3;
  print s4;
}