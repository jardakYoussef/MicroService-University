const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const TraficSchema = new Schema({
  studentId: {
    type: String,
    required: true
  },
  progress: {
    type: Number,
    required: true
  },
  completed: {
    type: Boolean,
    default: false
  }
});

const trafic = mongoose.model('Trafic', TraficSchema);

module.exports = trafic;
