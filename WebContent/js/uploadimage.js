function readURL(input) {
  if (input.files && input.files[0]) {
    var reader = new FileReader();
    reader.onload = function (e) {
      $('#image')
        .attr('src', e.target.result)
        .width(96)
        .height(96);
    };
    reader.readAsDataURL(input.files[0]);
  }
}