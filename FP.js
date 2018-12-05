var button = pro1.createElement("button");
button.innerHTML = "Do Something";

// 2. Append somewhere
var body = pro1.getElementsByTagName("body")[0];
body.appendChild(button);

// 3. Add event handler
button.addEventListener ("click", function() {
  alert("did something");
});