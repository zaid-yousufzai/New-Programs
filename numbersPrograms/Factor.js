function isFactor(n)
{
    for(let i=1;i<n;i++)
    {
        if(n%i===0)
        {
            process.stdout.write(i+" ");
        }
    }
}

isFactor(18);