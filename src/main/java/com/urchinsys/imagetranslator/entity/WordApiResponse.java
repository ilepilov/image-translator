package com.urchinsys.imagetranslator.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_EMPTY)
public class WordApiResponse {
  private String definition;
  private String partOfSpeech;
  private List<String> examples;
  private List<String> synonyms;
  private List<String> antonyms;
}
