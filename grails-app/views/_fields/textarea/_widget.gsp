<g:textArea name="${property}" required="${required}" class="form-control">${value}</g:textArea>

<asset:script>
    $(document).ready(function() {
      $('#${property}').summernote();
});
</asset:script>
