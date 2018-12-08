const myFunction = () => {
  //set up your elements
  const output = document.getElementById('output');
  const output2 = document.getElementById('output2');
  const outputloc = document.getElementById('outputloc');
  const recname = document.getElementById('recname');
  const recadd = document.getElementById('recadd');
  const x = document.getElementById('result');

  //get the values
  const fn = document.getElementById('fn').value;
  const ln = document.getElementById('ln').value;
  const loc = document.getElementById('loc').value;
  const rn = document.getElementById('rn').value;
  const ra = document.getElementById('ra').value;

  //check if values have content or if they are all empty strings.
  const hasContent = (fn + ln + loc + rn + ra).length > 0;

  //attach content to element
  output.innerHTML = fn;
  output2.innerHTML = ln;
  outputloc.innerHTML = loc;
  recname.innerHTML = rn;
  recadd.innerHTML = ra;

  //if any of the elements have content, display: block
  if (hasContent) {
    x.style.display = 'block';
  } else {
    x.style.display = 'none';
  }
};
