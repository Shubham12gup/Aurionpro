document.querySelector('.inputText').addEventListener('input', (e) => {
    document.querySelector('.result_text').value = e.currentTarget.value.replace(/[^a-zA-Z ]/g, "");
  });