try{
    const inputData=[5,3,6,2,9,8,1];
const sortedArray=descendingArray(inputData);
console.log("Sorted Array in Descending order: ",sortedArray);
}
catch(error){
    console.log("something went wrong");
}
function descendingArray(input){
    let len=input.length;
    for(let i=0;i<len-1;i++){
        for(let j=0;j<len-1-i;j++){
            if(isNaN(input[j]) || isNaN(input[j+1])){
                throw new Error("The given array contain non-numeric values");
            }
            if(input[j]<input[j+1]){
                let temp=input[j];
                input[j]=input[j+1];
                input[j+1]=temp;
            }
        }
    }
    return input;
}