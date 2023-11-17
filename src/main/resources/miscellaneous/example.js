    submit.onclick = async (e) => {
        let response = await fetch('http://localhost:8482/encode', {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json',
                },
        })

        let text = await response.text(); // read response body as text
        data = JSON.parse(text);
        document.querySelector("#encoded").innerHTML = text;
      //  document.querySelector("#encoded").innerHTML = `First name = ${data.firstname} <br/>
      //                                                  Last name = ${data.lastname} <br/>
      //                                                  Age    = ${data.age}`
    };

    formElem.onsubmit = async (e) => {
      e.preventDefault();
      var form = document.querySelector("#formElem");
     // var form = document.forms[0];

        data = {
          firstname : form.querySelector('input[name="firstname"]').value,
          lastname : form.querySelector('input[name="lastname"]').value,
          age : 5
        }

        let response = await fetch('http://localhost:8482/decode', {
                method: 'POST', // or 'PUT'
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(data),
        })

        let text = await response.text(); // read response body as text
        document.querySelector("#decoded").innerHTML = text;
    };


        const thisForm = document.getElementById('wfhRequestForm');
        thisForm.addEventListener('submit', async function (e) {
            e.preventDefault();
            const formData = new FormData(thisForm).entries()
            const response = await fetch('http://localhost:8080/add_request', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(Object.fromEntries(formData))
            });
            const result = await response.json();
            console.log(result)
        });