from flask import Flask
from flask import jsonify,json
import pandas as pd
#json_string = json.dumps(datastore)




app = Flask(__name__)

@app.route('/home.html')
def index():
	return "HELLO WORLD"

@app.route('/users')
def disp_users():
	data = pd.read_json('users.json')
	data = data.values.tolist()
	return jsonify(data)

@app.route('/movies')
def disp_movies():
	return "movies"

@app.route('/booking')
def disp_booking():
	return "Booking data"

@app.route('/showtimes')
def disp_showtimes():
	return "showtimes"


if __name__=='__main__':
	app.run(debug = True)
