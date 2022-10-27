document.querySelector('#inputText').addEventListener('input', (e) => {
    document.querySelector('#result_text').textContent = e.currentTarget.value.replace(/[^a-zA-Z ]/g, "");
  });

  ///[^a-zA-Z ]/g, ""
  //replace(/[^a-zA-Z ]/, "");

//The "g" modifier specifies a global match. A global match finds all matches (compared to only the first).