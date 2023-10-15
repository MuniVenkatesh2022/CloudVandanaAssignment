try{
    const userInput=prompt("Enter text:");
    const reversedText= reversewordsInSentence(userInput);
    console.log("Original Text: ",userInput);
    console.log("Reversed Sentence: ",reversedText)
}catch(error){
    alert("dlkf");
}

function reversewordsInSentence(inputText){
    const words=inputText.split(' ');
    const reverseWords=[];
    for(const word of words){
        reverseWords.push(reverseWord(word));
    }
    return reverseWords.join(' ');
}

function reverseWord(word){
    const wordArray=word.split('');
    let left=0;
    let right=wordArray.length-1;
    while(left<right){
        const temp=wordArray[left];
        wordArray[left]=wordArray[right];
        wordArray[right]=temp;
        left++;
        right--;
    }
    return wordArray.join('');
}